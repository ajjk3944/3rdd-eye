.class public final Ljr0;
.super Lao0;
.source "r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b"

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field public final i:Ljava/util/ArrayList;

.field public j:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Lwk0;)V
    .locals 0

    .line 1
    const-string p2, "arrayList"

    .line 2
    .line 3
    invoke-static {p1, p2}, Li30;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lao0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ljr0;->i:Ljava/util/ArrayList;

    .line 10
    .line 11
    iput-object p1, p0, Ljr0;->j:Ljava/util/ArrayList;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object v0, p0, Ljr0;->j:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final d(Lwo0;I)V
    .locals 2

    .line 1
    :try_start_0
    check-cast p1, Lir0;

    .line 2
    .line 3
    iget-object v0, p0, Ljr0;->j:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "get(...)"

    .line 10
    .line 11
    invoke-static {p2, v0}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast p2, Lhr0;

    .line 15
    .line 16
    iget-object v0, p1, Lir0;->u:Landroid/widget/TextView;

    .line 17
    .line 18
    iget-object v1, p2, Lhr0;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p1, Lir0;->v:Landroid/widget/TextView;

    .line 24
    .line 25
    iget-object v1, p2, Lhr0;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p1, Lir0;->w:Landroid/widget/TextView;

    .line 31
    .line 32
    iget-object v1, p2, Lhr0;->c:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p1, Lir0;->x:Landroid/widget/TextView;

    .line 38
    .line 39
    iget-object p2, p2, Lhr0;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    :catch_0
    return-void
.end method

.method public final e(Landroid/view/ViewGroup;I)Lwo0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const v0, 0x7f0c0049

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance p2, Lir0;

    .line 18
    .line 19
    invoke-static {p1}, Li30;->j(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p2, p1}, Lwo0;-><init>(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    const v0, 0x7f090277

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "findViewById(...)"

    .line 33
    .line 34
    invoke-static {v0, v1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    check-cast v0, Landroid/widget/TextView;

    .line 38
    .line 39
    iput-object v0, p2, Lir0;->u:Landroid/widget/TextView;

    .line 40
    .line 41
    const v0, 0x7f090297

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0, v1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast v0, Landroid/widget/TextView;

    .line 52
    .line 53
    iput-object v0, p2, Lir0;->v:Landroid/widget/TextView;

    .line 54
    .line 55
    const v0, 0x7f090298

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0, v1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, Landroid/widget/TextView;

    .line 66
    .line 67
    iput-object v0, p2, Lir0;->w:Landroid/widget/TextView;

    .line 68
    .line 69
    const v0, 0x7f09028b

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1, v1}, Li30;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    check-cast p1, Landroid/widget/TextView;

    .line 80
    .line 81
    iput-object p1, p2, Lir0;->x:Landroid/widget/TextView;

    .line 82
    .line 83
    return-object p2
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .line 1
    new-instance v0, Lcl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcl;-><init>(Ljr0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
