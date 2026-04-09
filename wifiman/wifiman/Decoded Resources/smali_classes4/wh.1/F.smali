.class Lwh/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/X;


# direct methods
.method public constructor <init>(Lwh/X;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/F;->a:Lwh/X;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/F;->a:Lwh/X;

    invoke-static {v0}, Lwh/X$a;->h(Lwh/X;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
