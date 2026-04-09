.class final LCd/g$h$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCd/g$h;->c(LCd/g$b;)Lgg/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LCd/g$h$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LCd/g$h$d;

    invoke-direct {v0}, LCd/g$h$d;-><init>()V

    sput-object v0, LCd/g$h$d;->a:LCd/g$h$d;

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

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LCd/g$h$d$a;->a:LCd/g$h$d$a;

    invoke-virtual {p1, v0}, Lgg/i;->p0(Lkg/n;)Lgg/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lgg/i;

    invoke-virtual {p0, p1}, LCd/g$h$d;->a(Lgg/i;)LDj/a;

    move-result-object p1

    return-object p1
.end method
