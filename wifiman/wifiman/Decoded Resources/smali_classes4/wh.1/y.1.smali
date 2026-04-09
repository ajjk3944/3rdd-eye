.class Lwh/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:LBh/b;

.field private final b:I


# direct methods
.method public constructor <init>(LBh/b;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/y;->a:LBh/b;

    iput p2, p0, Lwh/y;->b:I

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/y;->a:LBh/b;

    iget v1, p0, Lwh/y;->b:I

    invoke-static {v0, v1}, Lwh/A;->M(LBh/b;I)LBh/V;

    move-result-object v0

    return-object v0
.end method
