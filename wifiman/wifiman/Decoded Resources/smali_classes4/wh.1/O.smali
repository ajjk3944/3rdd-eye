.class Lwh/O;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/X;

.field private final b:Lwh/X$a;


# direct methods
.method public constructor <init>(Lwh/X;Lwh/X$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/O;->a:Lwh/X;

    iput-object p2, p0, Lwh/O;->b:Lwh/X$a;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/O;->a:Lwh/X;

    iget-object v1, p0, Lwh/O;->b:Lwh/X$a;

    invoke-static {v0, v1}, Lwh/X$a;->p(Lwh/X;Lwh/X$a;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
