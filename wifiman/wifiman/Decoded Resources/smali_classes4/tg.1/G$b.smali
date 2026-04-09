.class final Ltg/G$b;
.super LBg/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field final b:Ltg/G$c;


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Ltg/G$c;)V
    .locals 0

    invoke-direct {p0, p1}, LBg/b;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Ltg/G$b;->b:Ltg/G$c;

    return-void
.end method

.method public static i1(Ljava/lang/Object;ILtg/G$a;Z)Ltg/G$b;
    .locals 1

    new-instance v0, Ltg/G$c;

    invoke-direct {v0, p1, p2, p0, p3}, Ltg/G$c;-><init>(ILtg/G$a;Ljava/lang/Object;Z)V

    new-instance p1, Ltg/G$b;

    invoke-direct {p1, p0, v0}, Ltg/G$b;-><init>(Ljava/lang/Object;Ltg/G$c;)V

    return-object p1
.end method


# virtual methods
.method protected L0(Lgg/x;)V
    .locals 1

    iget-object v0, p0, Ltg/G$b;->b:Ltg/G$c;

    invoke-virtual {v0, p1}, Ltg/G$c;->d(Lgg/x;)V

    return-void
.end method

.method public a()V
    .locals 1

    iget-object v0, p0, Ltg/G$b;->b:Ltg/G$c;

    invoke-virtual {v0}, Ltg/G$c;->h()V

    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Ltg/G$b;->b:Ltg/G$c;

    invoke-virtual {v0, p1}, Ltg/G$c;->m(Ljava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Ltg/G$b;->b:Ltg/G$c;

    invoke-virtual {v0, p1}, Ltg/G$c;->j(Ljava/lang/Throwable;)V

    return-void
.end method
