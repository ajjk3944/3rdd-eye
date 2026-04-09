.class public final LYg/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lmh/q;


# direct methods
.method public constructor <init>(Lmh/q;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYg/a;->a:Lmh/q;

    return-void
.end method


# virtual methods
.method public final a()Lmh/q;
    .locals 1

    iget-object v0, p0, LYg/a;->a:Lmh/q;

    return-object v0
.end method
