.class final Lkd/g$c$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd/g$c;->a(LZc/e;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lkd/g$c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkd/g$c$c;

    invoke-direct {v0}, Lkd/g$c$c;-><init>()V

    sput-object v0, Lkd/g$c$c;->a:Lkd/g$c$c;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LWc/b;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, LWc/b$a$b;

    return p1
.end method

.method public bridge synthetic test(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, LWc/b;

    invoke-virtual {p0, p1}, Lkd/g$c$c;->a(LWc/b;)Z

    move-result p1

    return p1
.end method
