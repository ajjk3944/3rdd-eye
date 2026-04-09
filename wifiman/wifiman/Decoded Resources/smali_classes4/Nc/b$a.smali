.class public final LNc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LNc/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LDc/k;


# direct methods
.method public constructor <init>(LDc/k;)V
    .locals 1

    const-string v0, "combiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNc/b$a;->a:LDc/k;

    return-void
.end method


# virtual methods
.method public final a()LDc/k;
    .locals 1

    iget-object v0, p0, LNc/b$a;->a:LDc/k;

    return-object v0
.end method
