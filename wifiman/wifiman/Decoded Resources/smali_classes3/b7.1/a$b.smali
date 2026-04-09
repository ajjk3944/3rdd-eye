.class public final Lb7/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lb7/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb7/b;

    invoke-direct {v0}, Lb7/b;-><init>()V

    iput-object v0, p0, Lb7/a$b;->a:Lb7/b;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;Ld7/a;)Lb7/a$b;
    .locals 1

    iget-object v0, p0, Lb7/a$b;->a:Lb7/b;

    iget-object v0, v0, Lb7/b;->c:Lb7/c;

    invoke-virtual {v0, p1, p2}, Lb7/c;->a(Ljava/lang/reflect/Type;Ld7/a;)V

    return-object p0
.end method

.method public b()Lb7/a;
    .locals 3

    new-instance v0, Lb7/a;

    iget-object v1, p0, Lb7/a$b;->a:Lb7/b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb7/a;-><init>(Lb7/b;Lb7/a$a;)V

    return-object v0
.end method
