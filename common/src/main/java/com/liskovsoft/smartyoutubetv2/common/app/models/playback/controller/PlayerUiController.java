package com.liskovsoft.smartyoutubetv2.common.app.models.playback.controller;

import com.liskovsoft.smartyoutubetv2.common.app.models.data.VideoGroup;

public interface PlayerUiController {
    void updateSuggestions(VideoGroup group);
    void resetSuggestedPosition();
    void clearSuggestions();
    void showControls(boolean show);
    boolean isSuggestionsShown();
    void setRepeatButtonState(int modeIndex);
}
