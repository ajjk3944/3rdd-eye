.class Lni/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lni/w;


# direct methods
.method public constructor <init>(Lni/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lni/v;->a:Lni/w;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lni/v;->a:Lni/w;

    invoke-static {v0}, Lni/w;->i(Lni/w;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
