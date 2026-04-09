.class Lii/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lii/t;


# direct methods
.method public constructor <init>(Lii/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lii/s;->a:Lii/t;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lii/s;->a:Lii/t;

    invoke-static {v0}, Lii/t;->j(Lii/t;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
