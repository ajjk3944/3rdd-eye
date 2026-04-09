.class Lii/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lii/q;


# direct methods
.method public constructor <init>(Lii/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lii/p;->a:Lii/q;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lii/p;->a:Lii/q;

    invoke-static {v0}, Lii/q;->i(Lii/q;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
