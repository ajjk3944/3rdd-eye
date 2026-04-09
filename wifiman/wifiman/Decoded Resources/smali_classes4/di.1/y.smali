.class Ldi/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field private final a:Lpi/S;


# direct methods
.method public constructor <init>(Lpi/S;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi/y;->a:Lpi/S;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ldi/y;->a:Lpi/S;

    check-cast p1, LBh/G;

    invoke-static {v0, p1}, Ldi/z;->d(Lpi/S;LBh/G;)Lpi/S;

    move-result-object p1

    return-object p1
.end method
