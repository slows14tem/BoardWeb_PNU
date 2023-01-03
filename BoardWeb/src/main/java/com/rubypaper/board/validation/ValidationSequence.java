package com.rubypaper.board.validation;

import javax.validation.GroupSequence;
import javax.validation.groups.Default;

import com.rubypaper.board.validation.ValidationGroups.NotEmptyGroup;
import com.rubypaper.board.validation.ValidationGroups.PatternCheckGroup;

@GroupSequence({Default.class, NotEmptyGroup.class, PatternCheckGroup.class, })
public interface ValidationSequence {

}
