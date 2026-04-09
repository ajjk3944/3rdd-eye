.class Lwh/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/o0;


# direct methods
.method public constructor <init>(Lwh/o0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/n0;->a:Lwh/o0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/n0;->a:Lwh/o0;

    invoke-static {v0}, Lwh/o0;->u0(Lwh/o0;)Lwh/o0$a;

    move-result-object v0

    return-object v0
.end method
