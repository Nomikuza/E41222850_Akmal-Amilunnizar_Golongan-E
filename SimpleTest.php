<?php
use PHPUnit\Framework\TestCase;

require_once "Wordcount.php";

class SimpleTest extends TestCase
{
    public function testCountWords()
    {
        $Wc = new WordCount();

        $TestSentence = "My name is Akmal kan";
        $WordCount = $Wc->countWords($TestSentence);

        $this->assertEquals(4, $WordCount);
    }
}
?>