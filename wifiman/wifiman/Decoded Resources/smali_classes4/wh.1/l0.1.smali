.class Lwh/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/m0;


# direct methods
.method public constructor <init>(Lwh/m0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/l0;->a:Lwh/m0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/l0;->a:Lwh/m0;

    invoke-static {v0}, Lwh/m0;->u0(Lwh/m0;)Lwh/m0$a;

    move-result-object v0

    return-object v0
.end method
