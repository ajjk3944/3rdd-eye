.class final Lfe/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfe/h;->c(Lgg/i;Lmh/l;)Lgg/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:Lfe/h$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lfe/h$b;

    invoke-direct {v0}, Lfe/h$b;-><init>()V

    sput-object v0, Lfe/h$b;->a:Lfe/h$b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)LWc/b;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LWc/b$a$b;

    invoke-direct {v0, p1}, LWc/b$a$b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lfe/h$b;->a(Ljava/lang/Object;)LWc/b;

    move-result-object p1

    return-object p1
.end method
