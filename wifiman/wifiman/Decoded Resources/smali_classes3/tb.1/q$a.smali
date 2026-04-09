.class Ltb/q$a;
.super Ltb/q$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltb/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Ltb/q;


# direct methods
.method public constructor <init>(Ltb/q;Ltb/i;Lgg/A;)V
    .locals 1

    const-string/jumbo v0, "request"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "emitter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ltb/q$a;->e:Ltb/q;

    invoke-direct {p0, p1, p2, p3}, Ltb/q$b;-><init>(Ltb/q;Ltb/i;Lgg/A;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c()Lkb/p;
    .locals 1

    invoke-virtual {p0}, Ltb/q$a;->g()Lkb/t;

    move-result-object v0

    return-object v0
.end method

.method protected g()Lkb/t;
    .locals 1

    new-instance v0, Lkb/t;

    invoke-direct {v0}, Lkb/t;-><init>()V

    return-object v0
.end method
