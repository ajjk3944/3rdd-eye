.class Lpi/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lpi/p;


# direct methods
.method public constructor <init>(Lpi/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/n;->a:Lpi/p;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpi/n;->a:Lpi/p;

    check-cast p1, Lpi/S;

    invoke-static {v0, p1}, Lpi/p;->o(Lpi/p;Lpi/S;)LYg/J;

    move-result-object p1

    return-object p1
.end method
