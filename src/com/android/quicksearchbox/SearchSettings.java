/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.quicksearchbox;

import android.content.Intent;
import android.view.Menu;

/**
 * Interface for search settings.
 */
public interface SearchSettings {

    public void upgradeSettingsIfNeeded();

    public Intent getSearchableItemsIntent();

    public boolean isCorpusEnabled(Corpus corpus);

    public boolean getShowWebSuggestions();

    /**
     * Informs our listeners about the updated settings data.
     */
    public void broadcastSettingsChanged();

    public void addMenuItems(Menu menu);

    public void updateMenuItems(Menu menu);

    public int getNextVoiceSearchHintIndex(int size);

    public void resetVoiceSearchHintFirstSeenTime();

    public boolean haveVoiceSearchHintsExpired(int currentVoiceSearchVersion);

    public Intent getSearchSettingsIntent();

    public boolean allowWebSearchShortcuts();

}
