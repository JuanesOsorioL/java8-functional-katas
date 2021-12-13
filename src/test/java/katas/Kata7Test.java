package katas;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;


public class Kata7Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata7.execute(), equalTo(4));
    }
}

/*
<[{id=70111470, title=Die Hard, boxart=[model.BoxArt@2cb4c3ab, model.BoxArt@13c78c0b]}, {id=654356453, title=Bad Boys, boxart=[model.BoxArt@12843fce, model.BoxArt@3dd3bcd]}, {id=65432445, title=The Chamber, boxart=[model.BoxArt@97e1986, model.BoxArt@26f67b76]}, {id=675465, title=Fracture, boxart=[model.BoxArt@153f5a29, model.BoxArt@7f560810, model.BoxArt@69d9c55]}]>
<[{id=70111470, title=Die Hard, boxart=[model.BoxArt@2cb4c3ab, model.BoxArt@13c78c0b]}, {id=654356453, title=Bad Boys, boxart=[model.BoxArt@12843fce, model.BoxArt@3dd3bcd]}, {id=65432445, title=The Chamber, boxart=[model.BoxArt@97e1986, model.BoxArt@26f67b76]}, {id=675465, title=Fracture, boxart=[model.BoxArt@153f5a29, model.BoxArt@7f560810, model.BoxArt@69d9c55]}]>
*/
