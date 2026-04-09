.class Lwh/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/v0;

.field private final b:Lwh/v0$a;


# direct methods
.method public constructor <init>(Lwh/v0;Lwh/v0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/u0;->a:Lwh/v0;

    iput-object p2, p0, Lwh/u0;->b:Lwh/v0$a;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/u0;->a:Lwh/v0;

    iget-object v1, p0, Lwh/u0;->b:Lwh/v0$a;

    invoke-static {v0, v1}, Lwh/v0$a;->h(Lwh/v0;Lwh/v0$a;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
