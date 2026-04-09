.class public final LGh/i;
.super LGh/h;
.source "SourceFile"

# interfaces
.implements LQh/c;


# instance fields
.field private final c:Ljava/lang/annotation/Annotation;


# direct methods
.method public constructor <init>(LZh/f;Ljava/lang/annotation/Annotation;)V
    .locals 1

    const-string v0, "annotation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LGh/h;-><init>(LZh/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, LGh/i;->c:Ljava/lang/annotation/Annotation;

    return-void
.end method


# virtual methods
.method public a()LQh/a;
    .locals 2

    new-instance v0, LGh/g;

    iget-object v1, p0, LGh/i;->c:Ljava/lang/annotation/Annotation;

    invoke-direct {v0, v1}, LGh/g;-><init>(Ljava/lang/annotation/Annotation;)V

    return-object v0
.end method
