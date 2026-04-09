.class Lwh/V;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/X$a;

.field private final b:Lwh/X;


# direct methods
.method public constructor <init>(Lwh/X$a;Lwh/X;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/V;->a:Lwh/X$a;

    iput-object p2, p0, Lwh/V;->b:Lwh/X;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/V;->a:Lwh/X$a;

    iget-object v1, p0, Lwh/V;->b:Lwh/X;

    invoke-static {v0, v1}, Lwh/X$a;->v(Lwh/X$a;Lwh/X;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
