.class public final LTe/Q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTe/Q;->j(LTe/M;LT/l;I)LTe/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field final synthetic b:Lsh/i;

.field final synthetic c:LTe/M;

.field final synthetic d:Landroid/content/Context;


# direct methods
.method constructor <init>(Lsh/i;LTe/M;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, LTe/Q$c;->b:Lsh/i;

    iput-object p2, p0, LTe/Q$c;->c:LTe/M;

    iput-object p3, p0, LTe/Q$c;->d:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "%.0f"

    iput-object p1, p0, LTe/Q$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(FLk6/b;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "chartValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LTe/Q$c;->b:Lsh/i;

    invoke-virtual {p2}, Lsh/g;->i()I

    move-result p2

    int-to-float p2, p2

    cmpg-float p2, p1, p2

    if-nez p2, :cond_3

    iget-object p1, p0, LTe/Q$c;->c:LTe/M;

    instance-of p2, p1, LTe/M$b;

    if-eqz p2, :cond_0

    iget-object p1, p0, LTe/Q$c;->d:Landroid/content/Context;

    sget p2, Lm8/c;->q4:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    instance-of p2, p1, LTe/M$c;

    if-eqz p2, :cond_1

    iget-object p1, p0, LTe/Q$c;->d:Landroid/content/Context;

    sget p2, Lm8/c;->s4:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    instance-of p1, p1, LTe/M$a;

    if-eqz p1, :cond_2

    iget-object p1, p0, LTe/Q$c;->d:Landroid/content/Context;

    sget p2, Lm8/c;->u4:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_3
    iget-object p2, p0, LTe/Q$c;->a:Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method
