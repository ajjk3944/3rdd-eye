.class Lwh/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/X$a;


# direct methods
.method public constructor <init>(Lwh/X$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/S;->a:Lwh/X$a;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lwh/S;->a:Lwh/X$a;

    invoke-static {v0}, Lwh/X$a;->s(Lwh/X$a;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
