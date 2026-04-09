.class Lni/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/m;


# direct methods
.method public constructor <init>(Lni/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/h;->a:Lni/m;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/h;->a:Lni/m;

    invoke-static {v0}, Lni/m;->S0(Lni/m;)LBh/q0;

    move-result-object v0

    return-object v0
.end method
