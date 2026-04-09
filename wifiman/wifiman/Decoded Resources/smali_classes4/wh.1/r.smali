.class Lwh/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/A;


# direct methods
.method public constructor <init>(Lwh/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/r;->a:Lwh/A;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/r;->a:Lwh/A;

    invoke-static {v0}, Lwh/A;->z(Lwh/A;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method
