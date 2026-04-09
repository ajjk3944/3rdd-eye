.class Lpi/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi/N;->a:Lmh/l;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lpi/N;->a:Lmh/l;

    check-cast p1, Lpi/S;

    invoke-static {v0, p1}, Lpi/Q;->f(Lmh/l;Lpi/S;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
