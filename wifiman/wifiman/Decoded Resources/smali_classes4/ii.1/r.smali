.class Lii/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lpi/G0;


# direct methods
.method public constructor <init>(Lpi/G0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lii/r;->a:Lpi/G0;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lii/r;->a:Lpi/G0;

    invoke-static {v0}, Lii/t;->i(Lpi/G0;)Lpi/G0;

    move-result-object v0

    return-object v0
.end method
