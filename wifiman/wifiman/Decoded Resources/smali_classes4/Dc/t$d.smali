.class final LDc/t$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDc/t;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LDc/t$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LDc/t$d;

    invoke-direct {v0}, LDc/t$d;-><init>()V

    sput-object v0, LDc/t$d;->a:LDc/t$d;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LDc/k;)LDj/a;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LDc/k;->a()Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LDc/k;

    invoke-virtual {p0, p1}, LDc/t$d;->a(LDc/k;)LDj/a;

    move-result-object p1

    return-object p1
.end method
