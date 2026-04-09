.class final LSc/e$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSc/e;->r()Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LSc/e$h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LSc/e$h;

    invoke-direct {v0}, LSc/e$h;-><init>()V

    sput-object v0, LSc/e$h;->a:LSc/e$h;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgg/i;)LDj/a;
    .locals 1

    const-string v0, "errorStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LSc/e$h$a;->a:LSc/e$h$a;

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, LSc/e$h;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
