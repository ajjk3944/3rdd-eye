.class Lni/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lmh/a;


# direct methods
.method public constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/u;->a:Lmh/a;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/u;->a:Lmh/a;

    invoke-static {v0}, Lni/w;->h(Lmh/a;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
