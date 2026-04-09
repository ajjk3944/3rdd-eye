.class Lpi/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lpi/A0;


# direct methods
.method public constructor <init>(Lpi/A0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/z0;->a:Lpi/A0;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpi/z0;->a:Lpi/A0;

    check-cast p1, Lpi/A0$b;

    invoke-static {v0, p1}, Lpi/A0;->b(Lpi/A0;Lpi/A0$b;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
