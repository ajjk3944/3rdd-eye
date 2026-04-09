.class Lni/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/S;


# direct methods
.method public constructor <init>(Lni/S;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/Q;->a:Lni/S;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/Q;->a:Lni/S;

    invoke-static {v0}, Lni/S;->M0(Lni/S;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
