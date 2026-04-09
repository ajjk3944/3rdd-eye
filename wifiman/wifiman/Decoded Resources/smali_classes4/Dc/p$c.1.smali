.class final LDc/p$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDc/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:LDc/k;

.field private final b:Ljava/util/Map;


# direct methods
.method public constructor <init>(LDc/k;Ljava/util/Map;)V
    .locals 1

    const-string v0, "combiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "engines"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDc/p$c;->a:LDc/k;

    iput-object p2, p0, LDc/p$c;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()LDc/k;
    .locals 1

    iget-object v0, p0, LDc/p$c;->a:LDc/k;

    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, LDc/p$c;->b:Ljava/util/Map;

    return-object v0
.end method
