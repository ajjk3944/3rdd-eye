.class Lwh/t;
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

    iput-object p1, p0, Lwh/t;->a:Lwh/A;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/t;->a:Lwh/A;

    invoke-static {v0}, Lwh/A;->D(Lwh/A;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
