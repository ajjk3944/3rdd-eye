.class public final LZh/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LZh/g;

.field private static final b:Lkotlin/text/p;

.field private static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LZh/g;

    invoke-direct {v0}, LZh/g;-><init>()V

    sput-object v0, LZh/g;->a:LZh/g;

    new-instance v0, Lkotlin/text/p;

    const-string v1, "[^\\p{L}\\p{Digit}]"

    invoke-direct {v0, v1}, Lkotlin/text/p;-><init>(Ljava/lang/String;)V

    sput-object v0, LZh/g;->b:Lkotlin/text/p;

    const-string v0, "$context_receiver"

    sput-object v0, LZh/g;->c:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(I)LZh/f;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, LZh/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, LZh/f;->h(Ljava/lang/String;)LZh/f;

    move-result-object p0

    const-string v0, "identifier(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LZh/g;->b:Lkotlin/text/p;

    const-string v1, "_"

    invoke-virtual {v0, p0, v1}, Lkotlin/text/p;->n(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
