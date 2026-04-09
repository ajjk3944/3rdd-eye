.class public final enum LF/v;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field private static final synthetic $VALUES:[LF/v;

.field public static final enum CHARACTER_PALETTE:LF/v;

.field public static final enum COPY:LF/v;

.field public static final enum CUT:LF/v;

.field public static final enum DELETE_FROM_LINE_START:LF/v;

.field public static final enum DELETE_NEXT_CHAR:LF/v;

.field public static final enum DELETE_NEXT_WORD:LF/v;

.field public static final enum DELETE_PREV_CHAR:LF/v;

.field public static final enum DELETE_PREV_WORD:LF/v;

.field public static final enum DELETE_TO_LINE_END:LF/v;

.field public static final enum DESELECT:LF/v;

.field public static final enum DOWN:LF/v;

.field public static final enum END:LF/v;

.field public static final enum HOME:LF/v;

.field public static final enum LEFT_CHAR:LF/v;

.field public static final enum LEFT_WORD:LF/v;

.field public static final enum LINE_END:LF/v;

.field public static final enum LINE_LEFT:LF/v;

.field public static final enum LINE_RIGHT:LF/v;

.field public static final enum LINE_START:LF/v;

.field public static final enum NEW_LINE:LF/v;

.field public static final enum NEXT_PARAGRAPH:LF/v;

.field public static final enum PAGE_DOWN:LF/v;

.field public static final enum PAGE_UP:LF/v;

.field public static final enum PASTE:LF/v;

.field public static final enum PREV_PARAGRAPH:LF/v;

.field public static final enum REDO:LF/v;

.field public static final enum RIGHT_CHAR:LF/v;

.field public static final enum RIGHT_WORD:LF/v;

.field public static final enum SELECT_ALL:LF/v;

.field public static final enum SELECT_DOWN:LF/v;

.field public static final enum SELECT_END:LF/v;

.field public static final enum SELECT_HOME:LF/v;

.field public static final enum SELECT_LEFT_CHAR:LF/v;

.field public static final enum SELECT_LEFT_WORD:LF/v;

.field public static final enum SELECT_LINE_END:LF/v;

.field public static final enum SELECT_LINE_LEFT:LF/v;

.field public static final enum SELECT_LINE_RIGHT:LF/v;

.field public static final enum SELECT_LINE_START:LF/v;

.field public static final enum SELECT_NEXT_PARAGRAPH:LF/v;

.field public static final enum SELECT_PAGE_DOWN:LF/v;

.field public static final enum SELECT_PAGE_UP:LF/v;

.field public static final enum SELECT_PREV_PARAGRAPH:LF/v;

.field public static final enum SELECT_RIGHT_CHAR:LF/v;

.field public static final enum SELECT_RIGHT_WORD:LF/v;

.field public static final enum SELECT_UP:LF/v;

.field public static final enum TAB:LF/v;

.field public static final enum UNDO:LF/v;

.field public static final enum UP:LF/v;


# instance fields
.field private final editsText:Z


# direct methods
.method private static final synthetic $values()[LF/v;
    .locals 48

    sget-object v0, LF/v;->LEFT_CHAR:LF/v;

    sget-object v1, LF/v;->RIGHT_CHAR:LF/v;

    sget-object v2, LF/v;->RIGHT_WORD:LF/v;

    sget-object v3, LF/v;->LEFT_WORD:LF/v;

    sget-object v4, LF/v;->NEXT_PARAGRAPH:LF/v;

    sget-object v5, LF/v;->PREV_PARAGRAPH:LF/v;

    sget-object v6, LF/v;->LINE_START:LF/v;

    sget-object v7, LF/v;->LINE_END:LF/v;

    sget-object v8, LF/v;->LINE_LEFT:LF/v;

    sget-object v9, LF/v;->LINE_RIGHT:LF/v;

    sget-object v10, LF/v;->UP:LF/v;

    sget-object v11, LF/v;->DOWN:LF/v;

    sget-object v12, LF/v;->PAGE_UP:LF/v;

    sget-object v13, LF/v;->PAGE_DOWN:LF/v;

    sget-object v14, LF/v;->HOME:LF/v;

    sget-object v15, LF/v;->END:LF/v;

    sget-object v16, LF/v;->COPY:LF/v;

    sget-object v17, LF/v;->PASTE:LF/v;

    sget-object v18, LF/v;->CUT:LF/v;

    sget-object v19, LF/v;->DELETE_PREV_CHAR:LF/v;

    sget-object v20, LF/v;->DELETE_NEXT_CHAR:LF/v;

    sget-object v21, LF/v;->DELETE_PREV_WORD:LF/v;

    sget-object v22, LF/v;->DELETE_NEXT_WORD:LF/v;

    sget-object v23, LF/v;->DELETE_FROM_LINE_START:LF/v;

    sget-object v24, LF/v;->DELETE_TO_LINE_END:LF/v;

    sget-object v25, LF/v;->SELECT_ALL:LF/v;

    sget-object v26, LF/v;->SELECT_LEFT_CHAR:LF/v;

    sget-object v27, LF/v;->SELECT_RIGHT_CHAR:LF/v;

    sget-object v28, LF/v;->SELECT_UP:LF/v;

    sget-object v29, LF/v;->SELECT_DOWN:LF/v;

    sget-object v30, LF/v;->SELECT_PAGE_UP:LF/v;

    sget-object v31, LF/v;->SELECT_PAGE_DOWN:LF/v;

    sget-object v32, LF/v;->SELECT_HOME:LF/v;

    sget-object v33, LF/v;->SELECT_END:LF/v;

    sget-object v34, LF/v;->SELECT_LEFT_WORD:LF/v;

    sget-object v35, LF/v;->SELECT_RIGHT_WORD:LF/v;

    sget-object v36, LF/v;->SELECT_NEXT_PARAGRAPH:LF/v;

    sget-object v37, LF/v;->SELECT_PREV_PARAGRAPH:LF/v;

    sget-object v38, LF/v;->SELECT_LINE_START:LF/v;

    sget-object v39, LF/v;->SELECT_LINE_END:LF/v;

    sget-object v40, LF/v;->SELECT_LINE_LEFT:LF/v;

    sget-object v41, LF/v;->SELECT_LINE_RIGHT:LF/v;

    sget-object v42, LF/v;->DESELECT:LF/v;

    sget-object v43, LF/v;->NEW_LINE:LF/v;

    sget-object v44, LF/v;->TAB:LF/v;

    sget-object v45, LF/v;->UNDO:LF/v;

    sget-object v46, LF/v;->REDO:LF/v;

    sget-object v47, LF/v;->CHARACTER_PALETTE:LF/v;

    filled-new-array/range {v0 .. v47}, [LF/v;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LF/v;

    const-string v1, "LEFT_CHAR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->LEFT_CHAR:LF/v;

    new-instance v0, LF/v;

    const-string v1, "RIGHT_CHAR"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->RIGHT_CHAR:LF/v;

    new-instance v0, LF/v;

    const-string v1, "RIGHT_WORD"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->RIGHT_WORD:LF/v;

    new-instance v0, LF/v;

    const-string v1, "LEFT_WORD"

    const/4 v4, 0x3

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->LEFT_WORD:LF/v;

    new-instance v0, LF/v;

    const-string v1, "NEXT_PARAGRAPH"

    const/4 v4, 0x4

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->NEXT_PARAGRAPH:LF/v;

    new-instance v0, LF/v;

    const-string v1, "PREV_PARAGRAPH"

    const/4 v4, 0x5

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->PREV_PARAGRAPH:LF/v;

    new-instance v0, LF/v;

    const-string v1, "LINE_START"

    const/4 v4, 0x6

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->LINE_START:LF/v;

    new-instance v0, LF/v;

    const-string v1, "LINE_END"

    const/4 v4, 0x7

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->LINE_END:LF/v;

    new-instance v0, LF/v;

    const-string v1, "LINE_LEFT"

    const/16 v4, 0x8

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->LINE_LEFT:LF/v;

    new-instance v0, LF/v;

    const-string v1, "LINE_RIGHT"

    const/16 v4, 0x9

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->LINE_RIGHT:LF/v;

    new-instance v0, LF/v;

    const-string v1, "UP"

    const/16 v4, 0xa

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->UP:LF/v;

    new-instance v0, LF/v;

    const-string v1, "DOWN"

    const/16 v4, 0xb

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->DOWN:LF/v;

    new-instance v0, LF/v;

    const-string v1, "PAGE_UP"

    const/16 v4, 0xc

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->PAGE_UP:LF/v;

    new-instance v0, LF/v;

    const-string v1, "PAGE_DOWN"

    const/16 v4, 0xd

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->PAGE_DOWN:LF/v;

    new-instance v0, LF/v;

    const-string v1, "HOME"

    const/16 v4, 0xe

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->HOME:LF/v;

    new-instance v0, LF/v;

    const-string v1, "END"

    const/16 v4, 0xf

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->END:LF/v;

    new-instance v0, LF/v;

    const-string v1, "COPY"

    const/16 v4, 0x10

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->COPY:LF/v;

    new-instance v0, LF/v;

    const-string v1, "PASTE"

    const/16 v4, 0x11

    invoke-direct {v0, v1, v4, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->PASTE:LF/v;

    new-instance v0, LF/v;

    const-string v1, "CUT"

    const/16 v4, 0x12

    invoke-direct {v0, v1, v4, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->CUT:LF/v;

    new-instance v0, LF/v;

    const-string v1, "DELETE_PREV_CHAR"

    const/16 v4, 0x13

    invoke-direct {v0, v1, v4, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->DELETE_PREV_CHAR:LF/v;

    new-instance v0, LF/v;

    const-string v1, "DELETE_NEXT_CHAR"

    const/16 v4, 0x14

    invoke-direct {v0, v1, v4, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->DELETE_NEXT_CHAR:LF/v;

    new-instance v0, LF/v;

    const-string v1, "DELETE_PREV_WORD"

    const/16 v4, 0x15

    invoke-direct {v0, v1, v4, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->DELETE_PREV_WORD:LF/v;

    new-instance v0, LF/v;

    const-string v1, "DELETE_NEXT_WORD"

    const/16 v4, 0x16

    invoke-direct {v0, v1, v4, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->DELETE_NEXT_WORD:LF/v;

    new-instance v0, LF/v;

    const-string v1, "DELETE_FROM_LINE_START"

    const/16 v4, 0x17

    invoke-direct {v0, v1, v4, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->DELETE_FROM_LINE_START:LF/v;

    new-instance v0, LF/v;

    const-string v1, "DELETE_TO_LINE_END"

    const/16 v4, 0x18

    invoke-direct {v0, v1, v4, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->DELETE_TO_LINE_END:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_ALL"

    const/16 v4, 0x19

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_ALL:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_LEFT_CHAR"

    const/16 v4, 0x1a

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_LEFT_CHAR:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_RIGHT_CHAR"

    const/16 v4, 0x1b

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_RIGHT_CHAR:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_UP"

    const/16 v4, 0x1c

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_UP:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_DOWN"

    const/16 v4, 0x1d

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_DOWN:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_PAGE_UP"

    const/16 v4, 0x1e

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_PAGE_UP:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_PAGE_DOWN"

    const/16 v4, 0x1f

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_PAGE_DOWN:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_HOME"

    const/16 v4, 0x20

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_HOME:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_END"

    const/16 v4, 0x21

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_END:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_LEFT_WORD"

    const/16 v4, 0x22

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_LEFT_WORD:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_RIGHT_WORD"

    const/16 v4, 0x23

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_RIGHT_WORD:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_NEXT_PARAGRAPH"

    const/16 v4, 0x24

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_NEXT_PARAGRAPH:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_PREV_PARAGRAPH"

    const/16 v4, 0x25

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_PREV_PARAGRAPH:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_LINE_START"

    const/16 v4, 0x26

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_LINE_START:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_LINE_END"

    const/16 v4, 0x27

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_LINE_END:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_LINE_LEFT"

    const/16 v4, 0x28

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_LINE_LEFT:LF/v;

    new-instance v0, LF/v;

    const-string v1, "SELECT_LINE_RIGHT"

    const/16 v4, 0x29

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->SELECT_LINE_RIGHT:LF/v;

    new-instance v0, LF/v;

    const-string v1, "DESELECT"

    const/16 v4, 0x2a

    invoke-direct {v0, v1, v4, v2}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->DESELECT:LF/v;

    new-instance v0, LF/v;

    const-string v1, "NEW_LINE"

    const/16 v2, 0x2b

    invoke-direct {v0, v1, v2, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->NEW_LINE:LF/v;

    new-instance v0, LF/v;

    const-string v1, "TAB"

    const/16 v2, 0x2c

    invoke-direct {v0, v1, v2, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->TAB:LF/v;

    new-instance v0, LF/v;

    const-string v1, "UNDO"

    const/16 v2, 0x2d

    invoke-direct {v0, v1, v2, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->UNDO:LF/v;

    new-instance v0, LF/v;

    const-string v1, "REDO"

    const/16 v2, 0x2e

    invoke-direct {v0, v1, v2, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->REDO:LF/v;

    new-instance v0, LF/v;

    const-string v1, "CHARACTER_PALETTE"

    const/16 v2, 0x2f

    invoke-direct {v0, v1, v2, v3}, LF/v;-><init>(Ljava/lang/String;IZ)V

    sput-object v0, LF/v;->CHARACTER_PALETTE:LF/v;

    invoke-static {}, LF/v;->$values()[LF/v;

    move-result-object v0

    sput-object v0, LF/v;->$VALUES:[LF/v;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, LF/v;->editsText:Z

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LF/v;
    .locals 1

    const-class v0, LF/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LF/v;

    return-object p0
.end method

.method public static values()[LF/v;
    .locals 1

    sget-object v0, LF/v;->$VALUES:[LF/v;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LF/v;

    return-object v0
.end method


# virtual methods
.method public final getEditsText()Z
    .locals 1

    iget-boolean v0, p0, LF/v;->editsText:Z

    return v0
.end method
