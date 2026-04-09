.class public final Lb7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Z

.field b:Lb7/d;

.field c:Lb7/c;

.field d:Z


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb7/b;->a:Z

    new-instance v1, Lb7/d;

    invoke-direct {v1}, Lb7/d;-><init>()V

    iput-object v1, p0, Lb7/b;->b:Lb7/d;

    new-instance v1, Lb7/c;

    invoke-direct {v1}, Lb7/c;-><init>()V

    iput-object v1, p0, Lb7/b;->c:Lb7/c;

    iput-boolean v0, p0, Lb7/b;->d:Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ld7/a;
    .locals 1

    iget-object v0, p0, Lb7/b;->c:Lb7/c;

    invoke-virtual {v0, p1}, Lb7/c;->b(Ljava/lang/reflect/Type;)Ld7/a;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lb7/b;->d:Z

    return v0
.end method
