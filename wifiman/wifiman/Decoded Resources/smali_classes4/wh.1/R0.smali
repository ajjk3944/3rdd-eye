.class Lwh/R0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/U0;

.field private final b:Lmh/a;


# direct methods
.method public constructor <init>(Lwh/U0;Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/R0;->a:Lwh/U0;

    iput-object p2, p0, Lwh/R0;->b:Lmh/a;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/R0;->a:Lwh/U0;

    iget-object v1, p0, Lwh/R0;->b:Lmh/a;

    invoke-static {v0, v1}, Lwh/U0;->b(Lwh/U0;Lmh/a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
