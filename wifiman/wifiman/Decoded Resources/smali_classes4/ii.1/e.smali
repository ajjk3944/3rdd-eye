.class Lii/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lii/f;


# direct methods
.method public constructor <init>(Lii/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lii/e;->a:Lii/f;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lii/e;->a:Lii/f;

    invoke-static {v0}, Lii/f;->h(Lii/f;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
