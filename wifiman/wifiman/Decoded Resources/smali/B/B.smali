.class public final LB/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/z1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB/B$a;
    }
.end annotation


# static fields
.field private static final e:LB/B$a;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:LT/q0;

.field private d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB/B$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB/B$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LB/B;->e:LB/B$a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LB/B;->a:I

    iput p3, p0, LB/B;->b:I

    sget-object v0, LB/B;->e:LB/B$a;

    invoke-static {v0, p1, p2, p3}, LB/B$a;->a(LB/B$a;III)Lsh/i;

    move-result-object p2

    invoke-static {}, LT/o1;->p()LT/n1;

    move-result-object p3

    invoke-static {p2, p3}, LT/o1;->h(Ljava/lang/Object;LT/n1;)LT/q0;

    move-result-object p2

    iput-object p2, p0, LB/B;->c:LT/q0;

    iput p1, p0, LB/B;->d:I

    return-void
.end method

.method private i(Lsh/i;)V
    .locals 1

    iget-object v0, p0, LB/B;->c:LT/q0;

    invoke-interface {v0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public g()Lsh/i;
    .locals 1

    iget-object v0, p0, LB/B;->c:LT/q0;

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsh/i;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LB/B;->g()Lsh/i;

    move-result-object v0

    return-object v0
.end method

.method public final j(I)V
    .locals 3

    iget v0, p0, LB/B;->d:I

    if-eq p1, v0, :cond_0

    iput p1, p0, LB/B;->d:I

    sget-object v0, LB/B;->e:LB/B$a;

    iget v1, p0, LB/B;->a:I

    iget v2, p0, LB/B;->b:I

    invoke-static {v0, p1, v1, v2}, LB/B$a;->a(LB/B$a;III)Lsh/i;

    move-result-object p1

    invoke-direct {p0, p1}, LB/B;->i(Lsh/i;)V

    :cond_0
    return-void
.end method
