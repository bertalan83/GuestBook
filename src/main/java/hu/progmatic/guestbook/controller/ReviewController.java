package hu.progmatic.guestbook.controller;

import hu.progmatic.guestbook.model.Review;
import hu.progmatic.guestbook.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class ReviewController {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @GetMapping(value = {"/","/home"})
    public String getHome() {
        return "index";
    }

    @GetMapping("/create")
    public String createRandomReview(Model model) {
        List<Review> allReviews = List.of
                (new Review("Leonie", "Butler",
                        "Not able to tell you how happy I am with none.",
                        LocalDate.now().minusDays(640)),
                        new Review("Kiya", "Watt",
                                "Your company is truly upstanding and is behind its product 100%.",
                                LocalDate.now().minusDays(578)),
                        new Review("Allana", "Knapp",
                                "None has really helped our business. It really saves me time and effort. none is exactly what our business has been lacking. None is worth much more than I paid. I don't know what else to say.",
                                LocalDate.now().minusDays(555)),
                        new Review("Jibril", "Major",
                                "I like none more and more each day because it makes my life a lot easier.",
                                LocalDate.now().minusDays(534)),
                        new Review("Dario", "Coates",
                                "None is the most valuable business resource we have EVER purchased.",
                                LocalDate.now().minusDays(640)),
                        new Review("Thiago", "Mcmillan",
                                "None has really helped our business",
                                LocalDate.now().minusDays(246)),
                        new Review("Ishika", "Davila",
                                "None is the most valuable business resource we have EVER purchased. Thank You!",
                                LocalDate.now().minusDays(75)),
                        new Review("Harriett", "Edmonds",
                                "I STRONGLY recommend none to EVERYONE interested in running a successful online business!",
                                LocalDate.now().minusDays(249)),
                        new Review("Terence", "Lindsey",
                                "We can't understand how we've been living without none.",
                                LocalDate.now().minusDays(111)),
                        new Review("Benny", "Lacey",
                                "It's really wonderful. None is the most valuable business resource we have EVER purchased. Man, this thing is getting better and better as I learn more about it. I wish I would have thought of it first.",
                                LocalDate.now().minusDays(234)),
                        new Review("Eiliyah", "Davila",
                                "None should be nominated for service of the year.",
                                LocalDate.now().minusDays(23)),
                        new Review("Simeon", "Skinner",
                                "None has completely surpassed our expectations. We've seen amazing results already.",
                                LocalDate.now().minusDays(4)),
                        new Review("Abbas", "Lord",
                                "None has really helped our business. None is the real deal! Nice work on your none",
                                LocalDate.now().minusDays(346)),
                        new Review("Kirk", "Campos",
                                "It's really wonderful. It's exactly what I've been looking for. I couldn't have asked for more than this. None has really helped our business.",
                                LocalDate.now().minusDays(212)),
                        new Review("Nazifa", "Pratt",
                                "I would like to personally thank you for your outstanding product. No matter where you go, none is the coolest, most happening thing around! I love your system.",
                                LocalDate.now().minusDays(129)),
                        new Review("Tracey", "Sharp",
                                "This none works quite well. It professionally improves my soccer by a lot.", LocalDate.now().minusDays(143)),
                new Review("Lyle", "Russel",
                                "I use it every Tuesday when i'm in my store.", LocalDate.now().minusDays(233)),
                new Review("Hugh", "Riley",
                                "It only works when I'm Kuwait.", LocalDate.now().minusDays(643)),
                new Review("Kathy", "Brown",
                                "I will refer everyone I know. I didn't even need training. I just can't get enough of none. I want to get a T-Shirt with none on it so I can show it off to everyone. I love your system.", LocalDate.now().minusDays(32)),
                new Review("Cheryl", "Turner",
                                "Man, this thing is getting better and better as I learn more about it. I just can't get enough of none. I want to get a T-Shirt with none on it so I can show it off to everyone.", LocalDate.now().minusDays(33)),
                new Review("Audrey", "Jones",
                                "None saved my business.", LocalDate.now().minusDays(3)),
                new Review("Florence", "Clark",
                                "I don't always clop, but when I do, it's because of none.", LocalDate.now().minusDays(133)),
                new Review("Glen", "Kim",
                                "Your company is truly upstanding and is behind its product 100%. It fits our needs perfectly. I would be lost without none", LocalDate.now().minusDays(43)),
                new Review("Meredith", "Ellis",
                                "I couldn't have asked for more than this. We've used none for the last five years. I didn't even need training. Nice work on your none.", LocalDate.now().minusDays(73)),
                new Review("Claudia", "Tyler",
                                "I will let my mum know about this, she could really make use of none! Thanks none! Very easy to use", LocalDate.now().minusDays(53)),
                new Review("Matt", "Walker",
                                "I have gotten at least 50 times the value from none. The best on the net! Very easy to use.", LocalDate.now().minusDays(1)),
                new Review("Kendra", "Young",
                                "Absolutely wonderful! You won't regret it. It's the perfect solution for our business. The service was excellent.", LocalDate.now().minusDays(0)),
                new Review("Katie", "Nichols",
                                "We're loving it. None is great. None should be nominated for service of the year. I was amazed at the quality of none.", LocalDate.now().minusDays(9)),
                new Review("Ian", "Burke",
                                "I would be lost without none.", LocalDate.now().minusDays(86)),
                new Review("Cassandra", "James",
                                "I am really satisfied with my none. It's incredible. I would like to personally thank you for your outstanding product.", LocalDate.now().minusDays(97)),
                new Review("Justin", "Willis",
                                "I will recommend you to my colleagues. Without none, we would have gone bankrupt by now. Man, this thing is getting better and better as I learn more about it.", LocalDate.now().minusDays(12)),
                new Review("Annie", "Vazquez",
                                "I am completely blown away.", LocalDate.now().minusDays(4)),
                new Review("Walter", "Christensen",
                                "The best on the net! Thanks for the great service.", LocalDate.now().minusDays(2)),
                new Review("Cameron", "Munoz",
                                "None is the most valuable business resource we have EVER purchased.", LocalDate.now().minusDays(6)),
                new Review("Sidney", "Flowers",
                                "Without none, we would have gone bankrupt by now. Absolutely wonderful! I would like to personally thank you for your outstanding product.", LocalDate.now().minusDays(334)));






        reviewRepository.saveAll(allReviews);

        return "redirect:/home";
    }

    @GetMapping("/all-reviews")
    public String allReviews(Model model) {
        List<Review> randoms = (List<Review>) reviewRepository.findAll();
        model.addAttribute("randoms", randoms);

        return "all";
    }


    @GetMapping("/new-review")
    public String newReview(Model model) {
        model.addAttribute("review", new Review());

        return "newReview";
    }

    @PostMapping("/new-review")
    public String newReviewPost(Review review, Model model) {
        review.setDate(LocalDate.now());
        model.addAttribute("newReview", review);
        reviewRepository.save(review);

        return "newReview";
    }

    @GetMapping("/search")
    public String search() {
        return "search1";
    }

    @GetMapping("/search/first-name")
    public String searchByFirstName(
            @RequestParam (name = "search", required = false) String search,
            Model model) {
        List<Review> reviews = reviewRepository.findByFirstNameContaining(search);
        model.addAttribute("reviews", reviews);

        return "searchByFirstName";
    }

    @GetMapping("/search/last-name")
    public String searchByLastName(
            @RequestParam (name = "search", required = false) String search,
            Model model) {
        List<Review> reviews = reviewRepository.findByLastNameContaining(search);
        model.addAttribute("reviews", reviews);

        return "searchByLastName";
    }




}
