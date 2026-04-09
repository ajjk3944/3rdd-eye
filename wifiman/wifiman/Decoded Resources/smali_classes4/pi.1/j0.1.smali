.class Lpi/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lpi/k0;


# direct methods
.method public constructor <init>(Lpi/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/j0;->a:Lpi/k0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpi/j0;->a:Lpi/k0;

    invoke-static {v0}, Lpi/k0;->e(Lpi/k0;)Lpi/S;

    move-result-object v0

    return-object v0
.end method
