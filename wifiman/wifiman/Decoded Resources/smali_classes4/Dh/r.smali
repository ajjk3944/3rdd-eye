.class public final LDh/r;
.super Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;
.source "SourceFile"

# interfaces
.implements LBh/w;


# instance fields
.field private final b:LBh/Y;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;LBh/Y;)V
    .locals 1

    const-string v0, "annotations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "correspondingProperty"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/b;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;)V

    iput-object p2, p0, LDh/r;->b:LBh/Y;

    return-void
.end method
