.class Lwh/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/v0$a;

.field private final b:Lwh/v0;


# direct methods
.method public constructor <init>(Lwh/v0$a;Lwh/v0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/s0;->a:Lwh/v0$a;

    iput-object p2, p0, Lwh/s0;->b:Lwh/v0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/s0;->a:Lwh/v0$a;

    iget-object v1, p0, Lwh/s0;->b:Lwh/v0;

    invoke-static {v0, v1}, Lwh/v0$a;->f(Lwh/v0$a;Lwh/v0;)Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method
