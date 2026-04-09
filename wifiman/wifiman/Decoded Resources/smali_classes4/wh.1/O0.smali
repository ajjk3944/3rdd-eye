.class Lwh/O0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/K0$d;


# direct methods
.method public constructor <init>(Lwh/K0$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/O0;->a:Lwh/K0$d;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/O0;->a:Lwh/K0$d;

    invoke-static {v0}, Lwh/K0$d;->g0(Lwh/K0$d;)Lxh/h;

    move-result-object v0

    return-object v0
.end method
