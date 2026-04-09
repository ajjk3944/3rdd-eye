.class Lwh/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/i0;


# direct methods
.method public constructor <init>(Lwh/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/g0;->a:Lwh/i0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/g0;->a:Lwh/i0;

    invoke-static {v0}, Lwh/i0;->e0(Lwh/i0;)Lxh/h;

    move-result-object v0

    return-object v0
.end method
