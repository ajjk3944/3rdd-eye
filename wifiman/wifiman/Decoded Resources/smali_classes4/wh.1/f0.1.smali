.class Lwh/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field private final a:Lwh/i0;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lwh/i0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwh/f0;->a:Lwh/i0;

    iput-object p2, p0, Lwh/f0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lwh/f0;->a:Lwh/i0;

    iget-object v1, p0, Lwh/f0;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lwh/i0;->d0(Lwh/i0;Ljava/lang/String;)LBh/z;

    move-result-object v0

    return-object v0
.end method
