.class public final synthetic Ltd/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/d;


# instance fields
.field public final synthetic a:Ltd/c;

.field public final synthetic b:Lkotlin/jvm/internal/N;


# direct methods
.method public synthetic constructor <init>(Ltd/c;Lkotlin/jvm/internal/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltd/b;->a:Ltd/c;

    iput-object p2, p0, Ltd/b;->b:Lkotlin/jvm/internal/N;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Ltd/b;->a:Ltd/c;

    iget-object v1, p0, Ltd/b;->b:Lkotlin/jvm/internal/N;

    invoke-static {v0, v1}, Ltd/c;->a(Ltd/c;Lkotlin/jvm/internal/N;)Z

    move-result v0

    return v0
.end method
