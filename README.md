![repetition](https://upload.wikimedia.org/wikipedia/commons/8/82/Leitner_system_alternative.svg)

# memori

Это простая программа для обучения на основе флеш карт. Приложение основано
на таких понятиях как *интервальное повторение*, *кривая забывания*, *система Лейтнера*.

## Из истории (wiki)
Идея, что интервальные повторения можно использовать для улучшения процесса обучения, впервые была предложена в книге «Психология обучения» (англ. Psychology of Study), написанной профессором Алеком Мейсом в 1932. В 1939 Spitzer протестировал эффект методики на студентах в Айове. Spitzer исследовал метод на более чем 3600 студентах и доказал его эффективность. Но эта ранняя работа оставалась незамеченной до конца 60-х, когда когнитивные психологи, в особенности Landuaer & Bjork and Melton, исследовали манипуляцию с интервалом повторения как способ улучшить запоминание. Примерно в то же время Пимслер стал первопроходцем в практическом применении теории интервальных повторений для обучения языков и в 1973 Себастьян Лейтнер придумал «Систему Лейтнера», универсальную систему обучения, основанную на карточках.

## Алгоритм

В программе используется простой алгоритм вычисления времени `time` следующего повторения.

    int main(int argc, char** argv) {
        std::cout << "Hello, World!" << std::endl;
        return 0;
    }

Система основана на следующих понятиях:

  - интервальное повторение
  - кривая забывания
  - система Лейтнера

### И еще какой-то текст
Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
