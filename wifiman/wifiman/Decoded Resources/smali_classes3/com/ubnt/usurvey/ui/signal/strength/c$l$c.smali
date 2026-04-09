.class final Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ubnt/usurvey/ui/signal/strength/c$l;->a(Ljava/lang/Boolean;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ubnt/usurvey/ui/signal/strength/c$l$c$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;

    invoke-direct {v0}, Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;-><init>()V

    sput-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;->a:Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgc/b;

    check-cast p2, Ll9/a;

    check-cast p3, Ll9/a;

    invoke-virtual {p0, p1, p2, p3}, Lcom/ubnt/usurvey/ui/signal/strength/c$l$c;->b(Lgc/b;Ll9/a;Ll9/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lgc/b;Ll9/a;Ll9/a;)Ll9/a;
    .locals 1

    const-string/jumbo v0, "tab"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lb8/d;

    invoke-virtual {p3}, Ll9/a;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lb8/b;

    sget-object v0, Lcom/ubnt/usurvey/ui/signal/strength/c$l$c$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    new-instance p1, Ll9/a;

    new-instance v0, LTe/S;

    invoke-direct {v0, p2, p3}, LTe/S;-><init>(Lb8/d;Lb8/b;)V

    invoke-direct {p1, v0}, Ll9/a;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ll9/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll9/a;-><init>(Ljava/lang/Object;)V

    :goto_0
    return-object p1
.end method
