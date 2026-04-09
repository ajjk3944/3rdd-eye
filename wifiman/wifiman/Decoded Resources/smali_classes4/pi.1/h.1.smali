.class Lpi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lpi/p;


# direct methods
.method public constructor <init>(Lpi/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/h;->a:Lpi/p;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpi/h;->a:Lpi/p;

    invoke-static {v0}, Lpi/p;->i(Lpi/p;)Lpi/p$b;

    move-result-object v0

    return-object v0
.end method
