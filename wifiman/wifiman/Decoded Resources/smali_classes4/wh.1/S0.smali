.class Lwh/S0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/U0;


# direct methods
.method public constructor <init>(Lwh/U0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/S0;->a:Lwh/U0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/S0;->a:Lwh/U0;

    invoke-static {v0}, Lwh/U0;->e(Lwh/U0;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
